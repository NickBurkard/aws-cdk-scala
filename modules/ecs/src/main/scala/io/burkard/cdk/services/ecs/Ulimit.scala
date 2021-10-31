package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ulimit {

  def apply(
    hardLimit: Option[Number] = None,
    name: Option[software.amazon.awscdk.services.ecs.UlimitName] = None,
    softLimit: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.Ulimit =
    (new software.amazon.awscdk.services.ecs.Ulimit.Builder)
      .hardLimit(hardLimit.orNull)
      .name(name.orNull)
      .softLimit(softLimit.orNull)
      .build()
}
