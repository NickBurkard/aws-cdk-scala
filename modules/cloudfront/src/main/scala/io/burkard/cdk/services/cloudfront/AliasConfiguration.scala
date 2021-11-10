package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasConfiguration {

  def apply(
    names: Option[List[String]] = None,
    sslMethod: Option[software.amazon.awscdk.services.cloudfront.SSLMethod] = None,
    acmCertRef: Option[String] = None,
    securityPolicy: Option[software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol] = None
  ): software.amazon.awscdk.services.cloudfront.AliasConfiguration =
    (new software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder)
      .names(names.map(_.asJava).orNull)
      .sslMethod(sslMethod.orNull)
      .acmCertRef(acmCertRef.orNull)
      .securityPolicy(securityPolicy.orNull)
      .build()
}
