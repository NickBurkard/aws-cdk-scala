package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventBusPolicyProps {

  def apply(
    statementId: String,
    statement: Option[AnyRef] = None,
    principal: Option[String] = None,
    action: Option[String] = None,
    condition: Option[software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty] = None,
    eventBusName: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnEventBusPolicyProps =
    (new software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder)
      .statementId(statementId)
      .statement(statement.orNull)
      .principal(principal.orNull)
      .action(action.orNull)
      .condition(condition.orNull)
      .eventBusName(eventBusName.orNull)
      .build()
}
