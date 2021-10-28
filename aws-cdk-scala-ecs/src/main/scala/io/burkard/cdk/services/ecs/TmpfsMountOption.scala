package io.burkard.cdk.services.ecs

sealed abstract class TmpfsMountOption(val underlying: software.amazon.awscdk.services.ecs.TmpfsMountOption)
  extends Product
    with Serializable

object TmpfsMountOption {
  implicit def toAws(value: TmpfsMountOption): software.amazon.awscdk.services.ecs.TmpfsMountOption =
    Option(value).map(_.underlying).orNull

  case object Defaults
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.DEFAULTS)

  case object Ro
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RO)

  case object Rw
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RW)

  case object Suid
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.SUID)

  case object Nosuid
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOSUID)

  case object Dev
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.DEV)

  case object Nodev
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NODEV)

  case object Exec
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.EXEC)

  case object Noexec
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOEXEC)

  case object Sync
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.SYNC)

  case object Async
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.ASYNC)

  case object Dirsync
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.DIRSYNC)

  case object Remount
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.REMOUNT)

  case object Mand
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.MAND)

  case object Nomand
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOMAND)

  case object Atime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.ATIME)

  case object Noatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOATIME)

  case object Diratime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.DIRATIME)

  case object Nodiratime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NODIRATIME)

  case object Bind
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.BIND)

  case object Rbind
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RBIND)

  case object Unbindable
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.UNBINDABLE)

  case object Runbindable
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RUNBINDABLE)

  case object Private
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.PRIVATE)

  case object Rprivate
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RPRIVATE)

  case object Shared
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.SHARED)

  case object Rshared
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RSHARED)

  case object Slave
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.SLAVE)

  case object Rslave
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RSLAVE)

  case object Relatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RELATIME)

  case object Norelatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NORELATIME)

  case object Strictatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.STRICTATIME)

  case object Nostrictatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOSTRICTATIME)

  case object Mode
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.MODE)

  case object Uid
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.UID)

  case object Gid
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.GID)

  case object NrInodes
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NR_INODES)

  case object NrBlocks
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NR_BLOCKS)

  case object Mpol
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.MPOL)
}
