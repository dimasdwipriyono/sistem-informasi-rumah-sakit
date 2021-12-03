-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jul 2021 pada 05.47
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumahsakit`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokter`
--

CREATE TABLE `dokter` (
  `kd_dokter` varchar(10) NOT NULL,
  `nama_dokter` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `kota` varchar(20) NOT NULL,
  `telepon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `dokter`
--

INSERT INTO `dokter` (`kd_dokter`, `nama_dokter`, `jenis_kelamin`, `alamat`, `kota`, `telepon`) VALUES
('DKTR01', 'DR.ANI', 'PEREMPUAN', 'RAGUNAN', 'JAKARTA SELATAN', '084938593839'),
('DKTR02', 'DR.ANANG', 'LAKI-LAKI', 'KEMRANJEN', 'BANYUMAS', '08493849583'),
('DKTR03', 'DR.IDA', 'PEREMPUAN', 'PANUSUPAN', 'PURBALINGGA', '085948493849'),
('DKTR04', 'DR.ANTO', 'LAKI-LAKI', 'KUTOWINANGUN', 'KEBUMEN', '081439438435');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `kd_pasien` varchar(10) NOT NULL,
  `nama_pasien` varchar(20) NOT NULL,
  `umur` varchar(10) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`kd_pasien`, `nama_pasien`, `umur`, `jenis_kelamin`, `alamat`) VALUES
('PSN01', 'PANJI', '23', 'Laki-Laki', 'PURWOKERTO SELATAN'),
('PSN02', 'JOKO', '50', 'Laki-Laki', 'BATURRADEN'),
('PSN03', 'RENA', '18', 'Perempuan', 'KEBUMEN'),
('PSN04', 'SUKIJAN', '67', 'Perempuan', 'KEDUNGBANTENG');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemeriksaan`
--

CREATE TABLE `pemeriksaan` (
  `kd_pemeriksaan` varchar(10) NOT NULL,
  `kd_dokter` varchar(10) NOT NULL,
  `nama_dokter` varchar(20) NOT NULL,
  `kd_pasien` varchar(10) NOT NULL,
  `nama_pasien` varchar(20) NOT NULL,
  `diagnosa` varchar(100) NOT NULL,
  `tgl_pemeriksaan` varchar(10) NOT NULL,
  `hasil` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemeriksaan`
--

INSERT INTO `pemeriksaan` (`kd_pemeriksaan`, `kd_dokter`, `nama_dokter`, `kd_pasien`, `nama_pasien`, `diagnosa`, `tgl_pemeriksaan`, `hasil`) VALUES
('PRKSA01', 'DKTR01', 'DR.ANI', 'PSN01', 'PANJI', 'Berat', '15-0702021', ''),
('PRKSA02', 'DKTR02', 'DR.ANANG', 'PSN02', 'JOKO', 'Berat', '1-07-2021', ''),
('PRKSA03', 'DKTR03', 'DR.IDA', 'PSN03', 'RENA', 'Ringan', '1-04-2021', ''),
('PRKSA04', 'DKTR04', 'DR.ANTO', 'PSN04', 'SUKIJAN', 'Ringan', '09-04-2021', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perawat`
--

CREATE TABLE `perawat` (
  `kd_perawat` varchar(10) NOT NULL,
  `nama_perawat` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `kota` varchar(20) NOT NULL,
  `telepon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `perawat`
--

INSERT INTO `perawat` (`kd_perawat`, `nama_perawat`, `jenis_kelamin`, `alamat`, `kota`, `telepon`) VALUES
('PRWT01', 'GANANG', 'LAKI-LAKI', 'BANYUMAS', 'BANYUMAS', '08123456789'),
('PRWT02', 'RIANA', 'PEREMPUAN', 'KALIMANAH', 'PURBALINGGA', '085391830494'),
('PRWT03', 'DESI', 'PEREMPUAN', 'CILONGOK', 'BANYUMAS', '0817483982948'),
('PRWT04', 'ANGGA', 'LAKI-LAKI', 'PEJAGOAN', 'KEBUMEN', '081384938475');

-- --------------------------------------------------------

--
-- Struktur dari tabel `rawat_inap`
--

CREATE TABLE `rawat_inap` (
  `kd_inap` varchar(10) NOT NULL,
  `kd_ruangan` varchar(10) NOT NULL,
  `nama_ruangan` varchar(20) NOT NULL,
  `kd_dokter` varchar(10) NOT NULL,
  `nama_dokter` varchar(20) NOT NULL,
  `kd_pasien` varchar(10) NOT NULL,
  `nama_pasien` varchar(20) NOT NULL,
  `kd_perawat` varchar(10) NOT NULL,
  `nama_perawat` varchar(20) NOT NULL,
  `tgl_inap` varchar(10) NOT NULL,
  `tgl_keluar` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `rawat_inap`
--

INSERT INTO `rawat_inap` (`kd_inap`, `kd_ruangan`, `nama_ruangan`, `kd_dokter`, `nama_dokter`, `kd_pasien`, `nama_pasien`, `kd_perawat`, `nama_perawat`, `tgl_inap`, `tgl_keluar`) VALUES
('INAP01', 'KMR01', 'R.DAHLIA', 'DKTR01', 'DR.ANI', 'PSN01', 'PANJI', 'PRWT01', 'GANANG', '12-03-2021', '15-03-2021'),
('INAP02', 'KMR02', 'R.MAWAR', 'DKTR02', 'DR.ANANG', 'PSN02', 'JOKO', 'PRWT02', 'RIANA', '25-05-2021', '28-05-2021'),
('INAP03', 'KMR03', 'R.KAMBOJA', 'DKTR03', 'DR.IDA', 'PSN03', 'RENA', 'PRWT03', 'DESI', '12-02-2021', '15-02-2021');

-- --------------------------------------------------------

--
-- Struktur dari tabel `rawat_jalan`
--

CREATE TABLE `rawat_jalan` (
  `kd_jalan` varchar(10) NOT NULL,
  `kd_dokter` varchar(10) NOT NULL,
  `nama_dokter` varchar(20) NOT NULL,
  `kd_pasien` varchar(10) NOT NULL,
  `nama_pasien` varchar(20) NOT NULL,
  `kd_resep` varchar(10) NOT NULL,
  `resep_obat` varchar(100) NOT NULL,
  `tgl_periksa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `rawat_jalan`
--

INSERT INTO `rawat_jalan` (`kd_jalan`, `kd_dokter`, `nama_dokter`, `kd_pasien`, `nama_pasien`, `kd_resep`, `resep_obat`, `tgl_periksa`) VALUES
('JALAN01', 'DKTR01', 'DR.ANI', 'PSN01', 'PANJI', 'RSP01', 'TOLAK ANGIN', '12-02-2021');

-- --------------------------------------------------------

--
-- Struktur dari tabel `resep`
--

CREATE TABLE `resep` (
  `kd_resep` varchar(10) NOT NULL,
  `resep_obat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `resep`
--

INSERT INTO `resep` (`kd_resep`, `resep_obat`) VALUES
('RSP01', 'TOLAK ANGIN'),
('RSP02', 'PARAMEX'),
('RSP03', 'BODREX'),
('RSP04', 'INZA');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruangan`
--

CREATE TABLE `ruangan` (
  `kd_ruangan` varchar(10) NOT NULL,
  `nama_ruangan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ruangan`
--

INSERT INTO `ruangan` (`kd_ruangan`, `nama_ruangan`) VALUES
('KMR01', 'R.DAHLIA'),
('KMR02', 'R.MAWAR'),
('KMR03', 'R.KAMBOJA'),
('KMR04', 'R.BOUGENVILLE');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `user_id` varchar(10) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `namauser` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`user_id`, `nama`, `namauser`, `password`) VALUES
('1', 'fery', 'fery', 'fery'),
('23', 'dimas', 'dimasdwi', 'dimas123');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`kd_dokter`);

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`kd_pasien`);

--
-- Indeks untuk tabel `pemeriksaan`
--
ALTER TABLE `pemeriksaan`
  ADD PRIMARY KEY (`kd_pemeriksaan`);

--
-- Indeks untuk tabel `perawat`
--
ALTER TABLE `perawat`
  ADD PRIMARY KEY (`kd_perawat`);

--
-- Indeks untuk tabel `rawat_inap`
--
ALTER TABLE `rawat_inap`
  ADD PRIMARY KEY (`kd_inap`);

--
-- Indeks untuk tabel `rawat_jalan`
--
ALTER TABLE `rawat_jalan`
  ADD PRIMARY KEY (`kd_jalan`);

--
-- Indeks untuk tabel `resep`
--
ALTER TABLE `resep`
  ADD PRIMARY KEY (`kd_resep`);

--
-- Indeks untuk tabel `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`kd_ruangan`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
