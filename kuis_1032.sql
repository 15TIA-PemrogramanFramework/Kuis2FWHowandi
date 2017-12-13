-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.34
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1032`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1032`
--

CREATE TABLE `identitas_1032` (
  `id` bigint(20) NOT NULL,
  `deskripsi` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1032`
--

INSERT INTO `identitas_1032` (`id`, `deskripsi`, `alamat`, `name`) VALUES
(1, 'bis', 'gu', 'how'),
(2, NULL, NULL, 'Ivonny');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1032`
--

CREATE TABLE `ipk_1032` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `kelas` varchar(255) DEFAULT NULL,
  `nilai` varchar(100) NOT NULL,
  `identitas1032_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1032`
--

INSERT INTO `ipk_1032` (`id`, `alamat`, `kelas`, `nilai`, `identitas1032_id`) VALUES
(11, 'jalan kambing', '3tia', '80', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1032`
--
ALTER TABLE `identitas_1032`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_p5eshhbwudnpyuqsg3sji0blj` (`name`);

--
-- Indexes for table `ipk_1032`
--
ALTER TABLE `ipk_1032`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_f4938bxik99bs9lo3f2rrghuu` (`nilai`),
  ADD KEY `FK59qqkpxi5ghww8fuiq0w4uy6j` (`identitas1032_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1032`
--
ALTER TABLE `identitas_1032`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `ipk_1032`
--
ALTER TABLE `ipk_1032`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1032`
--
ALTER TABLE `ipk_1032`
  ADD CONSTRAINT `FK59qqkpxi5ghww8fuiq0w4uy6j` FOREIGN KEY (`identitas1032_id`) REFERENCES `identitas_1032` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
