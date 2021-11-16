package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RulesConfigurationTypeProperty {

  def apply(
    rules: List[_]
  ): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder)
      .rules(rules.asJava)
      .build()
}
