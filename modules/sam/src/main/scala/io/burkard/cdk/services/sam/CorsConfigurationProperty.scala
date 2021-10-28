package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CorsConfigurationProperty {

  def apply(
    allowHeaders: Option[String] = None,
    allowOrigin: Option[String] = None,
    allowCredentials: Option[Boolean] = None,
    allowMethods: Option[String] = None,
    maxAge: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty =
    (new software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty.Builder)
      .allowHeaders(allowHeaders.orNull)
      .allowOrigin(allowOrigin.orNull)
      .allowCredentials(allowCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowMethods(allowMethods.orNull)
      .maxAge(maxAge.orNull)
      .build()
}