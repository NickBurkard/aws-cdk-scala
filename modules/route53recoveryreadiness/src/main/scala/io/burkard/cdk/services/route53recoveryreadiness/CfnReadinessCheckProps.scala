package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReadinessCheckProps {

  def apply(
    readinessCheckName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    resourceSetName: Option[String] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps.Builder)
      .readinessCheckName(readinessCheckName)
      .tags(tags.map(_.asJava).orNull)
      .resourceSetName(resourceSetName.orNull)
      .build()
}
