package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourcePermissionProperty {

  def apply(
    principal: String,
    actions: List[String]
  ): software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty.Builder)
      .principal(principal)
      .actions(actions.asJava)
      .build()
}
