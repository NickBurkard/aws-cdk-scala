package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftDataParametersProperty {

  def apply(
    database: String,
    sql: String,
    secretManagerArn: Option[String] = None,
    statementName: Option[String] = None,
    withEvent: Option[Boolean] = None,
    dbUser: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty.Builder)
      .database(database)
      .sql(sql)
      .secretManagerArn(secretManagerArn.orNull)
      .statementName(statementName.orNull)
      .withEvent(withEvent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dbUser(dbUser.orNull)
      .build()
}
