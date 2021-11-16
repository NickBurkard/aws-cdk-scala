package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftSourceConfigProperty {

  def apply(
    databasePort: Number,
    clusterIdentifier: String,
    vpcConfiguration: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty,
    tableName: String,
    roleArn: String,
    secretManagerArn: String,
    databaseName: String,
    databaseHost: String
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder)
      .databasePort(databasePort)
      .clusterIdentifier(clusterIdentifier)
      .vpcConfiguration(vpcConfiguration)
      .tableName(tableName)
      .roleArn(roleArn)
      .secretManagerArn(secretManagerArn)
      .databaseName(databaseName)
      .databaseHost(databaseHost)
      .build()
}
