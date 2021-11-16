package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasConfiguration {

  def apply(
    names: List[String],
    acmCertRef: String,
    sslMethod: Option[software.amazon.awscdk.services.cloudfront.SSLMethod] = None,
    securityPolicy: Option[software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol] = None
  ): software.amazon.awscdk.services.cloudfront.AliasConfiguration =
    (new software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder)
      .names(names.asJava)
      .acmCertRef(acmCertRef)
      .sslMethod(sslMethod.orNull)
      .securityPolicy(securityPolicy.orNull)
      .build()
}
