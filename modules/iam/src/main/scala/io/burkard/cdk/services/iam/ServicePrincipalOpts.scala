package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServicePrincipalOpts {

  def apply(
    conditions: Option[Map[String, _]] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.iam.ServicePrincipalOpts =
    (new software.amazon.awscdk.services.iam.ServicePrincipalOpts.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .region(region.orNull)
      .build()
}
