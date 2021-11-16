package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNamedQuery {

  def apply(
    internalResourceId: String,
    database: String,
    queryString: String,
    workGroup: Option[String] = None,
    name: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.athena.CfnNamedQuery =
    software.amazon.awscdk.services.athena.CfnNamedQuery.Builder
      .create(stackCtx, internalResourceId)
      .database(database)
      .queryString(queryString)
      .workGroup(workGroup.orNull)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
