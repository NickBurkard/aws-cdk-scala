package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventBusPolicy {

  def apply(
    internalResourceId: String,
    statementId: String,
    statement: Option[AnyRef] = None,
    principal: Option[String] = None,
    action: Option[String] = None,
    condition: Option[software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty] = None,
    eventBusName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnEventBusPolicy =
    software.amazon.awscdk.services.events.CfnEventBusPolicy.Builder
      .create(stackCtx, internalResourceId)
      .statementId(statementId)
      .statement(statement.orNull)
      .principal(principal.orNull)
      .action(action.orNull)
      .condition(condition.orNull)
      .eventBusName(eventBusName.orNull)
      .build()
}
