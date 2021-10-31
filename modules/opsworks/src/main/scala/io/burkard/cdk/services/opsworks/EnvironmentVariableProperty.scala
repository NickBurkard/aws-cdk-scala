package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentVariableProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None,
    secure: Option[Boolean] = None
  ): software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty =
    (new software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .secure(secure.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
