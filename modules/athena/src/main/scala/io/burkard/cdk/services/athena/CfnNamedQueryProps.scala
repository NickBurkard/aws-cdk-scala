package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNamedQueryProps {

  def apply(
    workGroup: Option[String] = None,
    database: Option[String] = None,
    name: Option[String] = None,
    description: Option[String] = None,
    queryString: Option[String] = None
  ): software.amazon.awscdk.services.athena.CfnNamedQueryProps =
    (new software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder)
      .workGroup(workGroup.orNull)
      .database(database.orNull)
      .name(name.orNull)
      .description(description.orNull)
      .queryString(queryString.orNull)
      .build()
}
