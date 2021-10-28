package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNamedQuery {

  def apply(
    internalResourceId: String,
    workGroup: Option[String] = None,
    database: Option[String] = None,
    name: Option[String] = None,
    description: Option[String] = None,
    queryString: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.athena.CfnNamedQuery =
    software.amazon.awscdk.services.athena.CfnNamedQuery.Builder
      .create(stackCtx, internalResourceId)
      .workGroup(workGroup.orNull)
      .database(database.orNull)
      .name(name.orNull)
      .description(description.orNull)
      .queryString(queryString.orNull)
      .build()
}
