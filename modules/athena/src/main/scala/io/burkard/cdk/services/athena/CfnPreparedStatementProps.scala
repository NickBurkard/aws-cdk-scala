package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPreparedStatementProps {

  def apply(
    workGroup: String,
    queryStatement: String,
    statementName: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.athena.CfnPreparedStatementProps =
    (new software.amazon.awscdk.services.athena.CfnPreparedStatementProps.Builder)
      .workGroup(workGroup)
      .queryStatement(queryStatement)
      .statementName(statementName)
      .description(description.orNull)
      .build()
}
