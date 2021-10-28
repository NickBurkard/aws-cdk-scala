package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TlsClientPolicy {

  def apply(
    mutualTlsCertificate: Option[software.amazon.awscdk.services.appmesh.MutualTlsCertificate] = None,
    ports: Option[List[_ <: Number]] = None,
    enforce: Option[Boolean] = None,
    validation: Option[software.amazon.awscdk.services.appmesh.TlsValidation] = None
  ): software.amazon.awscdk.services.appmesh.TlsClientPolicy =
    (new software.amazon.awscdk.services.appmesh.TlsClientPolicy.Builder)
      .mutualTlsCertificate(mutualTlsCertificate.orNull)
      .ports(ports.map(_.asJava).orNull)
      .enforce(enforce.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validation(validation.orNull)
      .build()
}
