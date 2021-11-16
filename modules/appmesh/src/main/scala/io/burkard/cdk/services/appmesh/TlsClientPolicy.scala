package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsClientPolicy {

  def apply(
    validation: software.amazon.awscdk.services.appmesh.TlsValidation,
    mutualTlsCertificate: Option[software.amazon.awscdk.services.appmesh.MutualTlsCertificate] = None,
    ports: Option[List[_ <: Number]] = None,
    enforce: Option[Boolean] = None
  ): software.amazon.awscdk.services.appmesh.TlsClientPolicy =
    (new software.amazon.awscdk.services.appmesh.TlsClientPolicy.Builder)
      .validation(validation)
      .mutualTlsCertificate(mutualTlsCertificate.orNull)
      .ports(ports.map(_.asJava).orNull)
      .enforce(enforce.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
