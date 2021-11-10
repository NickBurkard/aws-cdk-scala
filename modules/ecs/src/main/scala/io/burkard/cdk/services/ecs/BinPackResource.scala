package io.burkard.cdk.services.ecs


sealed abstract class BinPackResource(val underlying: software.amazon.awscdk.services.ecs.BinPackResource)
  extends Product
    with Serializable


object BinPackResource {
  implicit def toAws(value: BinPackResource): software.amazon.awscdk.services.ecs.BinPackResource =
    Option(value).map(_.underlying).orNull

  case object Cpu
    extends BinPackResource(software.amazon.awscdk.services.ecs.BinPackResource.CPU)

  case object Memory
    extends BinPackResource(software.amazon.awscdk.services.ecs.BinPackResource.MEMORY)
}
