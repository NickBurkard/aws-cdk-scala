package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRecoveryGroup {

  def apply(
    internalResourceId: String,
    cells: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    recoveryGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup =
    software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup.Builder
      .create(stackCtx, internalResourceId)
      .cells(cells.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .recoveryGroupName(recoveryGroupName.orNull)
      .build()
}
