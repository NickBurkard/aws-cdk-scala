package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRecoveryGroupProps {

  def apply(
    recoveryGroupName: String,
    cells: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps.Builder)
      .recoveryGroupName(recoveryGroupName)
      .cells(cells.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
