package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AnalyticsConfigurationProperty {

  def apply(
    applicationId: Option[String] = None,
    applicationArn: Option[String] = None,
    roleArn: Option[String] = None,
    externalId: Option[String] = None,
    userDataShared: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty.Builder)
      .applicationId(applicationId.orNull)
      .applicationArn(applicationArn.orNull)
      .roleArn(roleArn.orNull)
      .externalId(externalId.orNull)
      .userDataShared(userDataShared.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
