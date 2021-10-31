package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReadinessCheck {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    resourceSetName: Option[String] = None,
    readinessCheckName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck =
    software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .resourceSetName(resourceSetName.orNull)
      .readinessCheckName(readinessCheckName.orNull)
      .build()
}
