package io.burkard.cdk.services.ecs

sealed abstract class UlimitName(val underlying: software.amazon.awscdk.services.ecs.UlimitName)
  extends Product
    with Serializable

object UlimitName {
  implicit def toAws(value: UlimitName): software.amazon.awscdk.services.ecs.UlimitName =
    Option(value).map(_.underlying).orNull

  case object Core
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.CORE)

  case object Cpu
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.CPU)

  case object Data
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.DATA)

  case object Fsize
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.FSIZE)

  case object Locks
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.LOCKS)

  case object Memlock
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.MEMLOCK)

  case object Msgqueue
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.MSGQUEUE)

  case object Nice
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.NICE)

  case object Nofile
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.NOFILE)

  case object Nproc
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.NPROC)

  case object Rss
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.RSS)

  case object Rtprio
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.RTPRIO)

  case object Rttime
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.RTTIME)

  case object Sigpending
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.SIGPENDING)

  case object Stack
    extends UlimitName(software.amazon.awscdk.services.ecs.UlimitName.STACK)
}
