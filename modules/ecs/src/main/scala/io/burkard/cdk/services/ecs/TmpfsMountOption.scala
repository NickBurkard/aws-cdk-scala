package io.burkard.cdk.services.ecs

sealed abstract class TmpfsMountOption(val underlying: software.amazon.awscdk.services.ecs.TmpfsMountOption)
  extends Product
    with Serializable

object TmpfsMountOption {
  implicit def toAws(value: TmpfsMountOption): software.amazon.awscdk.services.ecs.TmpfsMountOption =
    Option(value).map(_.underlying).orNull

  case object Async
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.ASYNC)

  case object Atime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.ATIME)

  case object Bind
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.BIND)

  case object Defaults
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.DEFAULTS)

  case object Dev
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.DEV)

  case object Diratime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.DIRATIME)

  case object Dirsync
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.DIRSYNC)

  case object Exec
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.EXEC)

  case object Gid
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.GID)

  case object Mand
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.MAND)

  case object Mode
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.MODE)

  case object Mpol
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.MPOL)

  case object Noatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOATIME)

  case object Nodev
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NODEV)

  case object Nodiratime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NODIRATIME)

  case object Noexec
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOEXEC)

  case object Nomand
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOMAND)

  case object Norelatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NORELATIME)

  case object Nostrictatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOSTRICTATIME)

  case object Nosuid
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOSUID)

  case object NrBlocks
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NR_BLOCKS)

  case object NrInodes
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.NR_INODES)

  case object Private
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.PRIVATE)

  case object Rbind
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RBIND)

  case object Relatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RELATIME)

  case object Remount
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.REMOUNT)

  case object Ro
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RO)

  case object Rprivate
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RPRIVATE)

  case object Rshared
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RSHARED)

  case object Rslave
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RSLAVE)

  case object Runbindable
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RUNBINDABLE)

  case object Rw
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.RW)

  case object Shared
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.SHARED)

  case object Slave
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.SLAVE)

  case object Strictatime
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.STRICTATIME)

  case object Suid
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.SUID)

  case object Sync
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.SYNC)

  case object Uid
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.UID)

  case object Unbindable
    extends TmpfsMountOption(software.amazon.awscdk.services.ecs.TmpfsMountOption.UNBINDABLE)
}
