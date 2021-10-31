package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
