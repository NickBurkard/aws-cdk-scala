package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPreparedStatementProps {

  def apply(
    workGroup: Option[String] = None,
    description: Option[String] = None,
    queryStatement: Option[String] = None,
    statementName: Option[String] = None
  ): software.amazon.awscdk.services.athena.CfnPreparedStatementProps =
    (new software.amazon.awscdk.services.athena.CfnPreparedStatementProps.Builder)
      .workGroup(workGroup.orNull)
      .description(description.orNull)
      .queryStatement(queryStatement.orNull)
      .statementName(statementName.orNull)
      .build()
}
