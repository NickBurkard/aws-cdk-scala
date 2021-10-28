package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServicePrincipal {

  def apply(
    service: String,
    conditions: Option[Map[String, _]] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.iam.ServicePrincipal =
    software.amazon.awscdk.services.iam.ServicePrincipal.Builder
      .create(service)
      .conditions(conditions.map(_.asJava).orNull)
      .region(region.orNull)
      .build()
}
