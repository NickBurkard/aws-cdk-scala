package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPreparedStatement {

  def apply(
    internalResourceId: String,
    workGroup: Option[String] = None,
    description: Option[String] = None,
    queryStatement: Option[String] = None,
    statementName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.athena.CfnPreparedStatement =
    software.amazon.awscdk.services.athena.CfnPreparedStatement.Builder
      .create(stackCtx, internalResourceId)
      .workGroup(workGroup.orNull)
      .description(description.orNull)
      .queryStatement(queryStatement.orNull)
      .statementName(statementName.orNull)
      .build()
}
