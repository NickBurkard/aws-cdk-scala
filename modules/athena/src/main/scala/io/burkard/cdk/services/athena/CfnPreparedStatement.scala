package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPreparedStatement {

  def apply(
    internalResourceId: String,
    workGroup: String,
    queryStatement: String,
    statementName: String,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.athena.CfnPreparedStatement =
    software.amazon.awscdk.services.athena.CfnPreparedStatement.Builder
      .create(stackCtx, internalResourceId)
      .workGroup(workGroup)
      .queryStatement(queryStatement)
      .statementName(statementName)
      .description(description.orNull)
      .build()
}
