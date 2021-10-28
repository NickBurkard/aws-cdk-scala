package io.burkard.cdk.services.cloudfront

sealed abstract class LambdaEdgeEventType(val underlying: software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType)
  extends Product
    with Serializable

object LambdaEdgeEventType {
  implicit def toAws(value: LambdaEdgeEventType): software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType =
    Option(value).map(_.underlying).orNull

  case object OriginRequest
    extends LambdaEdgeEventType(software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.ORIGIN_REQUEST)

  case object OriginResponse
    extends LambdaEdgeEventType(software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.ORIGIN_RESPONSE)

  case object ViewerRequest
    extends LambdaEdgeEventType(software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.VIEWER_REQUEST)

  case object ViewerResponse
    extends LambdaEdgeEventType(software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType.VIEWER_RESPONSE)
}
