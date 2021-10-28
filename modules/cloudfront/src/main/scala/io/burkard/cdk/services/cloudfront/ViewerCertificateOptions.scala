package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ViewerCertificateOptions {

  def apply(
    aliases: Option[List[String]] = None,
    sslMethod: Option[software.amazon.awscdk.services.cloudfront.SSLMethod] = None,
    securityPolicy: Option[software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol] = None
  ): software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions =
    (new software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions.Builder)
      .aliases(aliases.map(_.asJava).orNull)
      .sslMethod(sslMethod.orNull)
      .securityPolicy(securityPolicy.orNull)
      .build()
}
