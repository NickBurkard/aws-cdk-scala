package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftDataParametersProperty {

  def apply(
    secretManagerArn: Option[String] = None,
    statementName: Option[String] = None,
    withEvent: Option[Boolean] = None,
    database: Option[String] = None,
    sql: Option[String] = None,
    dbUser: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty.Builder)
      .secretManagerArn(secretManagerArn.orNull)
      .statementName(statementName.orNull)
      .withEvent(withEvent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .database(database.orNull)
      .sql(sql.orNull)
      .dbUser(dbUser.orNull)
      .build()
}
