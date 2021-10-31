package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
