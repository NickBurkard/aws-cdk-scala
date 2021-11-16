package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CorsConfigurationProperty {

  def apply(
    allowOrigin: String,
    allowHeaders: Option[String] = None,
    allowCredentials: Option[Boolean] = None,
    allowMethods: Option[String] = None,
    maxAge: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty =
    (new software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty.Builder)
      .allowOrigin(allowOrigin)
      .allowHeaders(allowHeaders.orNull)
      .allowCredentials(allowCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowMethods(allowMethods.orNull)
      .maxAge(maxAge.orNull)
      .build()
}
