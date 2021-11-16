package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IamActionDefinitionProperty {

  def apply(
    policyArn: String,
    users: Option[List[String]] = None,
    groups: Option[List[String]] = None,
    roles: Option[List[String]] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty.Builder)
      .policyArn(policyArn)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}
