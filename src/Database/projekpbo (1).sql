-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2024 at 09:38 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projekpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tlpn` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`nim`, `nama`, `kelas`, `alamat`, `email`, `tlpn`, `tempat_lahir`) VALUES
('112212740', 'Muhamad Izzat Muttaqin', '2D31', 'Jl. H. Yahya, No.10', '112212740@stis.ac.id', '081345628747', 'Malang'),
('112313237', 'Muhammad Fouzan', '1ST5', 'Jl. Kebon Nanas Selatan No. 10', '112313237@stis.ac.id', '082174751548', 'Banda Aceh'),
('121212607', 'Alfaraby Nirwan', '2KS3', 'Jl. Mangga, No. 10	', '121212607@stis.ac.id', '082170786085', 'Bukittinggi'),
('212212487', 'Altytan Marzherega Asmoro', '2ST6', 'Jl. Sensus, No. 25', '212212487@stis.ac.id', '089645261957', 'Yogyakarta'),
('212212560', 'Dedy Hendriko Hasiholan Sinaga', '2ST5', 'Kos Barokah, Gang Peudati', '212212560@stis.ac.id', '082199363075', 'Medan'),
('212212567', 'Iqbal Maulana', '2ST7', 'Jl. Kebon Nanas Selatan 1, No. 10', '212212567@stis.ac.id', '089508475812', 'Banda Aceh'),
('212212577', 'Dyatmika Ardaya Indriya Jati', '2ST5', 'Jl. Kebon Nanas Selatan I No.10, RT.16/RW.8, Cipinang Cempedak, Kecamatan Jatinegara', '212212577@stis.ac.id', '081246514802', 'Tuban, Jawa Timur'),
('212212771', 'Muhammad Sabril Husnan', '2ST7', 'Jl. H. Hasbi, No.20', '212212771@stis.ac.id', '0895424037518', 'Jakarta'),
('212212789', 'RIfky Syauqi', '2ST7', 'Jl. Kebon Nanas Selatan, No. 10, Cipinang Cempedak', '212212789@stis.ac.id', '089545620507', 'Binjai'),
('212212909', 'Vicha Amalia Akbar', '2ST6', 'Jl. Kebon Sayur No. 36', '212212909@stis.ac.id', '08113041902', 'Malang'),
('212313155', 'Juan Thomos Brian Siagian', '1ST4', 'Jl. Kebon Sayur, No. 46B', '212313155@stis.ac.id', '082174582598', 'Medan'),
('222212605', 'Fauzan', '2KS3', 'Jl. Kebon Nanas Selatan I No.10, RT.16/RW.8, Cipinang Cempedak, Kecamatan Jatinegara', '222212605@stis.ac.id', '082170786085', 'Padang');

-- --------------------------------------------------------

--
-- Table structure for table `pendaftar`
--

CREATE TABLE `pendaftar` (
  `nama_kegiatan` varchar(50) NOT NULL,
  `nim` varchar(100) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jeniskelamin` varchar(10) NOT NULL,
  `tingkat` int(10) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tlpn` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pendaftar`
--

INSERT INTO `pendaftar` (`nama_kegiatan`, `nim`, `nama`, `jeniskelamin`, `tingkat`, `alamat`, `email`, `tlpn`) VALUES
('Friendly Match Futsal', '112313237', 'Muhammad Fouzan', 'Laki-Laki', 1, 'Jl. Kebon Nanas Selatan, No. 10', '112313237@stis.ac.id', '082145652010'),
('Fun Futsal', '2110313055', 'Aufaa Nabiilah ', 'Perempuan', 3, 'Padang', '2110313055@stis.ac.id', '0895618272991'),
('Friendly Match Futsal', '212212543', 'Cesya Claudia Sirait', 'Perempuan', 2, 'Jl. Masjid, No. 20', '212212543@stis.ac.id', '082315488070'),
('Bina Fisik', '212212560', 'Dedy Hendriko Hasiholan Sinaga', 'Laki-Laki', 2, 'Kos Barokah', '212212560@stis.ac.id', '089625148978'),
('Mini Soccer', '212212577', 'Dyatmika Ardaya Indriya Jati', 'Laki-Laki', 2, 'Jl. Kebon Nanas Selatan I No.10, RT.16/RW.8, Cipinang Cempedak,', '212212577@stis.ac.id', '089545682547'),
('Friendly Match Futsal', '212212774', 'Muhammad Zacky Arie P.', 'Laki-Laki', 2, 'Jl. Masjid, No. 7. Belakang SD', '212212774@stis.ac.id', '082270788501'),
('Fun Futsal', '212313227', 'Muhammad Akmal Sabiq', 'Laki-Laki', 1, 'Jl. Peudati, No. 20', '212313227@stis.ac.id', '082170784520'),
('Mini Soccer', '212313355', 'Rizqi Arby Maulana', 'Laki-Laki', 1, 'Jl. Masjid, No. 15', '212313355@stis.ac.id', '089584602574'),
('Bina Fisik', '222212434', 'Vicha Amalia', 'Perempuan', 2, 'Jl. Kebon Sayur, No. 15A', '222212434@stis.ac.id', '082170785478'),
('Fun Futsal', '222212455', 'Agape Bagus Rega', 'Laki-Laki', 2, 'Jl. Yahya, No. 10', '222212455@stis.ac.id', '082145620878'),
('Fun Futsal', '222212607', 'Fauzan Alfaraby Nirwan', 'Laki-Laki', 2, 'Jl. Kebon Nanas Selatan, No 10', '222212607@stis.ac.id', '082170786085');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `email`, `pass`) VALUES
(1, 'Admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `pendaftar`
--
ALTER TABLE `pendaftar`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
