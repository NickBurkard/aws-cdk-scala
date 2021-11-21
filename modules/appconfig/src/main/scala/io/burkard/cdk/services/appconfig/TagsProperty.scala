package io.burkard.cdk.services.appconfig

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagsProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.appconfig.CfnDeployment.TagsProperty =
    (new software.amazon.awscdk.services.appconfig.CfnDeployment.TagsProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
