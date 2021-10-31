package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReadinessCheckProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    resourceSetName: Option[String] = None,
    readinessCheckName: Option[String] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .resourceSetName(resourceSetName.orNull)
      .readinessCheckName(readinessCheckName.orNull)
      .build()
}
