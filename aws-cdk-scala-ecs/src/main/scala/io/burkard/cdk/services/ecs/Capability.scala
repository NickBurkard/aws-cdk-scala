package io.burkard.cdk.services.ecs

sealed abstract class Capability(val underlying: software.amazon.awscdk.services.ecs.Capability)
  extends Product
    with Serializable

object Capability {
  implicit def toAws(value: Capability): software.amazon.awscdk.services.ecs.Capability =
    Option(value).map(_.underlying).orNull

  case object All
    extends Capability(software.amazon.awscdk.services.ecs.Capability.ALL)

  case object AuditControl
    extends Capability(software.amazon.awscdk.services.ecs.Capability.AUDIT_CONTROL)

  case object AuditWrite
    extends Capability(software.amazon.awscdk.services.ecs.Capability.AUDIT_WRITE)

  case object BlockSuspend
    extends Capability(software.amazon.awscdk.services.ecs.Capability.BLOCK_SUSPEND)

  case object Chown
    extends Capability(software.amazon.awscdk.services.ecs.Capability.CHOWN)

  case object DacOverride
    extends Capability(software.amazon.awscdk.services.ecs.Capability.DAC_OVERRIDE)

  case object DacReadSearch
    extends Capability(software.amazon.awscdk.services.ecs.Capability.DAC_READ_SEARCH)

  case object Fowner
    extends Capability(software.amazon.awscdk.services.ecs.Capability.FOWNER)

  case object Fsetid
    extends Capability(software.amazon.awscdk.services.ecs.Capability.FSETID)

  case object IpcLock
    extends Capability(software.amazon.awscdk.services.ecs.Capability.IPC_LOCK)

  case object IpcOwner
    extends Capability(software.amazon.awscdk.services.ecs.Capability.IPC_OWNER)

  case object Kill
    extends Capability(software.amazon.awscdk.services.ecs.Capability.KILL)

  case object Lease
    extends Capability(software.amazon.awscdk.services.ecs.Capability.LEASE)

  case object LinuxImmutable
    extends Capability(software.amazon.awscdk.services.ecs.Capability.LINUX_IMMUTABLE)

  case object MacAdmin
    extends Capability(software.amazon.awscdk.services.ecs.Capability.MAC_ADMIN)

  case object MacOverride
    extends Capability(software.amazon.awscdk.services.ecs.Capability.MAC_OVERRIDE)

  case object Mknod
    extends Capability(software.amazon.awscdk.services.ecs.Capability.MKNOD)

  case object NetAdmin
    extends Capability(software.amazon.awscdk.services.ecs.Capability.NET_ADMIN)

  case object NetBindService
    extends Capability(software.amazon.awscdk.services.ecs.Capability.NET_BIND_SERVICE)

  case object NetBroadcast
    extends Capability(software.amazon.awscdk.services.ecs.Capability.NET_BROADCAST)

  case object NetRaw
    extends Capability(software.amazon.awscdk.services.ecs.Capability.NET_RAW)

  case object Setfcap
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SETFCAP)

  case object Setgid
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SETGID)

  case object Setpcap
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SETPCAP)

  case object Setuid
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SETUID)

  case object SysAdmin
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_ADMIN)

  case object SysBoot
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_BOOT)

  case object SysChroot
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_CHROOT)

  case object SysModule
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_MODULE)

  case object SysNice
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_NICE)

  case object SysPacct
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_PACCT)

  case object SysPtrace
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_PTRACE)

  case object SysRawio
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_RAWIO)

  case object SysResource
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_RESOURCE)

  case object SysTime
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_TIME)

  case object SysTtyConfig
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYS_TTY_CONFIG)

  case object Syslog
    extends Capability(software.amazon.awscdk.services.ecs.Capability.SYSLOG)

  case object WakeAlarm
    extends Capability(software.amazon.awscdk.services.ecs.Capability.WAKE_ALARM)
}
