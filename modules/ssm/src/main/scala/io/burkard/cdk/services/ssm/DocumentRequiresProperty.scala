package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DocumentRequiresProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty =
    (new software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
