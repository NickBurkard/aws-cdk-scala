package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ulimit {

  def apply(
    hardLimit: Number,
    name: software.amazon.awscdk.services.ecs.UlimitName,
    softLimit: Number
  ): software.amazon.awscdk.services.ecs.Ulimit =
    (new software.amazon.awscdk.services.ecs.Ulimit.Builder)
      .hardLimit(hardLimit)
      .name(name)
      .softLimit(softLimit)
      .build()
}
