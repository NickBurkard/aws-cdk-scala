package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourcePermissionProperty {

  def apply(
    principal: Option[String] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty.Builder)
      .principal(principal.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
