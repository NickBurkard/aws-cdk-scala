package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SSMParameterContextQuery {

  def apply(
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None,
    region: Option[String] = None,
    parameterName: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery.Builder)
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .region(region.orNull)
      .parameterName(parameterName.orNull)
      .build()
}
