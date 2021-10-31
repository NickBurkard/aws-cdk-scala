package io.burkard.cdk.services.budgets

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IamActionDefinitionProperty {

  def apply(
    users: Option[List[String]] = None,
    groups: Option[List[String]] = None,
    roles: Option[List[String]] = None,
    policyArn: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty.Builder)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .roles(roles.map(_.asJava).orNull)
      .policyArn(policyArn.orNull)
      .build()
}
