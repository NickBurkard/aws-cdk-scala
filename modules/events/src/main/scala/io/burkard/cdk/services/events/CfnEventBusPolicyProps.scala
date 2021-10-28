package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEventBusPolicyProps {

  def apply(
    statement: Option[AnyRef] = None,
    principal: Option[String] = None,
    statementId: Option[String] = None,
    action: Option[String] = None,
    condition: Option[software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty] = None,
    eventBusName: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnEventBusPolicyProps =
    (new software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder)
      .statement(statement.orNull)
      .principal(principal.orNull)
      .statementId(statementId.orNull)
      .action(action.orNull)
      .condition(condition.orNull)
      .eventBusName(eventBusName.orNull)
      .build()
}
