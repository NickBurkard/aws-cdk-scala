package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RegistryProperty {

  def apply(
    arn: Option[String] = None,
    name: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty =
    (new software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty.Builder)
      .arn(arn.orNull)
      .name(name.orNull)
      .build()
}
