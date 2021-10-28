package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RedshiftSourceConfigProperty {

  def apply(
    databasePort: Option[Number] = None,
    clusterIdentifier: Option[String] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty] = None,
    tableName: Option[String] = None,
    roleArn: Option[String] = None,
    secretManagerArn: Option[String] = None,
    databaseName: Option[String] = None,
    databaseHost: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder)
      .databasePort(databasePort.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .tableName(tableName.orNull)
      .roleArn(roleArn.orNull)
      .secretManagerArn(secretManagerArn.orNull)
      .databaseName(databaseName.orNull)
      .databaseHost(databaseHost.orNull)
      .build()
}
