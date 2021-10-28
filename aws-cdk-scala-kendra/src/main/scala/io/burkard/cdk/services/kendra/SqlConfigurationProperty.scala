package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqlConfigurationProperty {

  def apply(
    queryIdentifiersEnclosingOption: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty.Builder)
      .queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption.orNull)
      .build()
}
