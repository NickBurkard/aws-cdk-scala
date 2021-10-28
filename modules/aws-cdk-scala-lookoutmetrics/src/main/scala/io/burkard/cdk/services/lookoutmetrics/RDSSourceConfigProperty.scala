package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RDSSourceConfigProperty {

  def apply(
    databasePort: Option[Number] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty] = None,
    tableName: Option[String] = None,
    roleArn: Option[String] = None,
    dbInstanceIdentifier: Option[String] = None,
    secretManagerArn: Option[String] = None,
    databaseName: Option[String] = None,
    databaseHost: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty.Builder)
      .databasePort(databasePort.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .tableName(tableName.orNull)
      .roleArn(roleArn.orNull)
      .dbInstanceIdentifier(dbInstanceIdentifier.orNull)
      .secretManagerArn(secretManagerArn.orNull)
      .databaseName(databaseName.orNull)
      .databaseHost(databaseHost.orNull)
      .build()
}
