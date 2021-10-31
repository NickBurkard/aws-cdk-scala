package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UlimitProperty {

  def apply(
    hardLimit: Option[Number] = None,
    name: Option[String] = None,
    softLimit: Option[Number] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder)
      .hardLimit(hardLimit.orNull)
      .name(name.orNull)
      .softLimit(softLimit.orNull)
      .build()
}
